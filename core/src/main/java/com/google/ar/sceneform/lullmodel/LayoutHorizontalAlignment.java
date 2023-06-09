// automatically generated by the FlatBuffers compiler, do not modify

package com.google.ar.sceneform.lullmodel;

/**
 * The anchor at which the entities will be aligned relative to the canvas.
 */
public final class LayoutHorizontalAlignment {
  private LayoutHorizontalAlignment() { }
  /**
   * The left border of the leftmost element will align to the left side of the
   * canvas.
   */
  public static final int Left = 0;
  /**
   * The layout will be centered horizontally on the canvas.
   */
  public static final int Center = 1;
  /**
   * The right border of the rightmost element will align to the right side of
   * the canvas.
   */
  public static final int Right = 2;

  public static final String[] names = { "Left", "Center", "Right", };

  public static String name(int e) { return names[e]; }
}

