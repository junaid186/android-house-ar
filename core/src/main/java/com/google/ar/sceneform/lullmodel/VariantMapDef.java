// automatically generated by the FlatBuffers compiler, do not modify

package com.google.ar.sceneform.lullmodel;

import java.nio.*;

import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * The flatbuffer equivalent for lull::VariantMap.
 */
public final class VariantMapDef extends Table {
  public static VariantMapDef getRootAsVariantMapDef(ByteBuffer _bb) { return getRootAsVariantMapDef(_bb, new VariantMapDef()); }
  public static VariantMapDef getRootAsVariantMapDef(ByteBuffer _bb, VariantMapDef obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public VariantMapDef __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public KeyVariantPairDef values(int j) { return values(new KeyVariantPairDef(), j); }
  public KeyVariantPairDef values(KeyVariantPairDef obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int valuesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createVariantMapDef(FlatBufferBuilder builder,
      int valuesOffset) {
    builder.startObject(1);
    VariantMapDef.addValues(builder, valuesOffset);
    return VariantMapDef.endVariantMapDef(builder);
  }

  public static void startVariantMapDef(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addValues(FlatBufferBuilder builder, int valuesOffset) { builder.addOffset(0, valuesOffset, 0); }
  public static int createValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endVariantMapDef(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

