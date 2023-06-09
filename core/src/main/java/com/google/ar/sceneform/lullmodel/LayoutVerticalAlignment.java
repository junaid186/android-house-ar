// automatically generated by the FlatBuffers compiler, do not modify

package com.google.ar.sceneform.lullmodel;

/**
 * The anchor at which the entities will be aligned *within* each row.
 * Note that rows collectively are still top aligned relative to the canvas.
 * To center align within the canvas, add a placeholder child entity with the
 * same height as the canvas.
 */
public final class LayoutVerticalAlignment {
  private LayoutVerticalAlignment() { }
  /**
   * Each entity will align to the top of its row in the layout.
   */
  public static final int Top = 0;
  /**
   * Each entity will be centered within its row.
   */
  public static final int Center = 1;
  /**
   * Each entity will align to the bottom of its row.
   */
  public static final int Bottom = 2;

  public static final String[] names = { "Top", "Center", "Bottom", };

  public static String name(int e) { return names[e]; }
}

