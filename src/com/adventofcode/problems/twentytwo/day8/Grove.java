package com.adventofcode.problems.twentytwo.day8;

public class Grove {
  private Tree[][] theGrove;
  private final int NUMBER_OF_ROWS;
  private final int NUMBER_OF_COLUMNS;
  public Grove(int numberOfColumns, int numberOfRows) {
    this.NUMBER_OF_ROWS = numberOfRows;
    this.NUMBER_OF_COLUMNS = numberOfColumns;
    theGrove = new Tree[numberOfRows][numberOfColumns];
    for (int row = 0; row < numberOfRows; row++) {
      for (int col = 0; col < numberOfColumns; col++) {
        theGrove[row][col] = new Tree(0);
      }
    }
  }

  public void setTreeHeight(int treeHeight, int treeRowPosition, int treeColumnPosition) {
    theGrove[treeRowPosition][treeColumnPosition] = new Tree(treeHeight);

  }

  public int getTreeHeight(int threeRowPosition, int treeColumnPosition) {
    return theGrove[threeRowPosition][treeColumnPosition].getHeight();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (Tree[] row : theGrove) {
      for (Tree tree : row) {
        result.append(Integer.toString(tree.getHeight()));
      }
      result.append("\n");
    }
    return result.toString();
  }

  public int getNumberOfTrees() {
    return NUMBER_OF_COLUMNS*NUMBER_OF_ROWS;
  }

  public int computeNumberOfVisualTrees() {
    int result = 0;
    for (int row = 0; row < theGrove.length; row++) {
      for (int col = 0; col < theGrove[row].length; col++) {
        result += computeTreeVisible(row, col);
      }
    }
    return result;
  }

  public int computeMostSenicTree() {
    int mostSenicValue = 0;
    for(int row = 0; row < NUMBER_OF_ROWS; row++) {
      for(int col = 0; col < NUMBER_OF_COLUMNS; col++) {
        int score = computeTreeSenicScore(row, col);
        if(score > mostSenicValue) {
          mostSenicValue = score;
        }
      }
    }
    return mostSenicValue;
  }

  private int computeTreeSenicScore(int row, int col) {
    int visibleLeft = 0;
    int visibleRight = 0;
    int visibleUp = 0;
    int visibleDown = 0;
    int treeHeight = getTreeHeight(row, col);
    for(int compRow = row-1; compRow >= 0; compRow--) {
      visibleLeft++;
      if(getTreeHeight(compRow, col) >= treeHeight) {
        break;
      }
    }
    for(int compRow = row+1; compRow < NUMBER_OF_ROWS; compRow++) {
      visibleRight++;
      if(getTreeHeight(compRow, col) >= treeHeight) {
        break;
      }
    }
    for(int compCol = col-1; compCol >= 0; compCol--) {
      visibleDown++;
      if(getTreeHeight(row, compCol) >= treeHeight) {
        break;
      }
    }
    for(int compCol = col+1; compCol < NUMBER_OF_COLUMNS; compCol++) {
      visibleUp++;
      if(getTreeHeight(row, compCol) >= treeHeight) {
        break;
      }
    }
    return visibleUp * visibleDown * visibleRight * visibleLeft;
  }

  private int computeTreeVisible(int rowPos, int colPos) {
    boolean visible = isEdgeIndex(rowPos, colPos) || isVisibleInRow(rowPos, colPos) || isVisibleInColumn(rowPos, colPos);
    theGrove[rowPos][colPos].setVisible(visible);
    return visible ? 1 : 0;

  }

  private boolean isEdgeIndex(int rowIndex, int colIndex) {
    return rowIndex == 0 || colIndex == 0 || rowIndex == NUMBER_OF_ROWS-1 || colIndex == NUMBER_OF_COLUMNS-1;
  }

  private boolean isVisibleInRow(int rowIndex, int colIndex) {
    boolean visible = true;
    int treeHeight = getTreeHeight(rowIndex, colIndex);
    for(int i = 0; i < NUMBER_OF_COLUMNS; i ++) {
      if(i == colIndex) {
        if(visible) {
          return true;
        } else {
          visible = true;
          continue;
        }
      }
      if(getTreeHeight(rowIndex, i) >= treeHeight) {
        visible = false;
      }
    }
    return visible;
  }

  private boolean isVisibleInColumn(int rowIndex, int colIndex) {
    boolean visible = true;
    int treeHeight = getTreeHeight(rowIndex, colIndex);
    for(int i = 0; i < NUMBER_OF_ROWS; i++) {
      if(i == rowIndex) {
        if(visible) {
          return true;
        } else {
          visible = true;
          continue;
        }
      }
      if(getTreeHeight(i, colIndex) >= treeHeight) {
        visible = false;
      }
    }
    return visible;
  }

  private class Tree {
    private boolean isVisible;
    private final int height;
    int senicScore = 0;

    private Tree(int height) {
      this.height = height;
      this.isVisible = true;
    }

    public boolean isVisible() {
      return isVisible;
    }

    public void setVisible(boolean visible) {
      isVisible = visible;
    }

    public int getHeight() {
      return height;
    }

    public int getSenicScore() {
      return senicScore;
    }

    public int setSenicScore() {
      return senicScore;
    }


  }
}



