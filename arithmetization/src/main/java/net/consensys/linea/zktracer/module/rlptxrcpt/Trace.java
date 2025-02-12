/*
 * Copyright ConsenSys Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package net.consensys.linea.zktracer.module.rlptxrcpt;

import java.nio.MappedByteBuffer;
import java.util.BitSet;
import java.util.List;

import net.consensys.linea.zktracer.ColumnHeader;
import net.consensys.linea.zktracer.types.UnsignedByte;
import org.apache.tuweni.bytes.Bytes;

/**
 * WARNING: This code is generated automatically.
 *
 * <p>Any modifications to this code may be overwritten and could lead to unexpected behavior.
 * Please DO NOT ATTEMPT TO MODIFY this code directly.
 */
public class Trace {
  public static final int SUBPHASE_ID_WEIGHT_DEPTH = 0x30;
  public static final int SUBPHASE_ID_WEIGHT_INDEX_LOCAL = 0x60;
  public static final int SUBPHASE_ID_WEIGHT_IS_OD = 0x18;
  public static final int SUBPHASE_ID_WEIGHT_IS_OT = 0xc;
  public static final int SUBPHASE_ID_WEIGHT_IS_PREFIX = 0x6;

  private final BitSet filled = new BitSet();
  private int currentLine = 0;

  private final MappedByteBuffer absLogNum;
  private final MappedByteBuffer absLogNumMax;
  private final MappedByteBuffer absTxNum;
  private final MappedByteBuffer absTxNumMax;
  private final MappedByteBuffer acc1;
  private final MappedByteBuffer acc2;
  private final MappedByteBuffer acc3;
  private final MappedByteBuffer acc4;
  private final MappedByteBuffer accSize;
  private final MappedByteBuffer bit;
  private final MappedByteBuffer bitAcc;
  private final MappedByteBuffer byte1;
  private final MappedByteBuffer byte2;
  private final MappedByteBuffer byte3;
  private final MappedByteBuffer byte4;
  private final MappedByteBuffer counter;
  private final MappedByteBuffer depth1;
  private final MappedByteBuffer done;
  private final MappedByteBuffer index;
  private final MappedByteBuffer indexLocal;
  private final MappedByteBuffer input1;
  private final MappedByteBuffer input2;
  private final MappedByteBuffer input3;
  private final MappedByteBuffer input4;
  private final MappedByteBuffer isData;
  private final MappedByteBuffer isPrefix;
  private final MappedByteBuffer isTopic;
  private final MappedByteBuffer lcCorrection;
  private final MappedByteBuffer limb;
  private final MappedByteBuffer limbConstructed;
  private final MappedByteBuffer localSize;
  private final MappedByteBuffer logEntrySize;
  private final MappedByteBuffer nBytes;
  private final MappedByteBuffer nStep;
  private final MappedByteBuffer phase1;
  private final MappedByteBuffer phase2;
  private final MappedByteBuffer phase3;
  private final MappedByteBuffer phase4;
  private final MappedByteBuffer phase5;
  private final MappedByteBuffer phaseEnd;
  private final MappedByteBuffer phaseId;
  private final MappedByteBuffer phaseSize;
  private final MappedByteBuffer power;
  private final MappedByteBuffer txrcptSize;

  static List<ColumnHeader> headers(int length) {
    return List.of(
        new ColumnHeader("rlptxrcpt.ABS_LOG_NUM", 8, length),
        new ColumnHeader("rlptxrcpt.ABS_LOG_NUM_MAX", 8, length),
        new ColumnHeader("rlptxrcpt.ABS_TX_NUM", 8, length),
        new ColumnHeader("rlptxrcpt.ABS_TX_NUM_MAX", 8, length),
        new ColumnHeader("rlptxrcpt.ACC_1", 32, length),
        new ColumnHeader("rlptxrcpt.ACC_2", 32, length),
        new ColumnHeader("rlptxrcpt.ACC_3", 32, length),
        new ColumnHeader("rlptxrcpt.ACC_4", 32, length),
        new ColumnHeader("rlptxrcpt.ACC_SIZE", 2, length),
        new ColumnHeader("rlptxrcpt.BIT", 1, length),
        new ColumnHeader("rlptxrcpt.BIT_ACC", 1, length),
        new ColumnHeader("rlptxrcpt.BYTE_1", 1, length),
        new ColumnHeader("rlptxrcpt.BYTE_2", 1, length),
        new ColumnHeader("rlptxrcpt.BYTE_3", 1, length),
        new ColumnHeader("rlptxrcpt.BYTE_4", 1, length),
        new ColumnHeader("rlptxrcpt.COUNTER", 8, length),
        new ColumnHeader("rlptxrcpt.DEPTH_1", 1, length),
        new ColumnHeader("rlptxrcpt.DONE", 1, length),
        new ColumnHeader("rlptxrcpt.INDEX", 4, length),
        new ColumnHeader("rlptxrcpt.INDEX_LOCAL", 4, length),
        new ColumnHeader("rlptxrcpt.INPUT_1", 32, length),
        new ColumnHeader("rlptxrcpt.INPUT_2", 32, length),
        new ColumnHeader("rlptxrcpt.INPUT_3", 32, length),
        new ColumnHeader("rlptxrcpt.INPUT_4", 32, length),
        new ColumnHeader("rlptxrcpt.IS_DATA", 1, length),
        new ColumnHeader("rlptxrcpt.IS_PREFIX", 1, length),
        new ColumnHeader("rlptxrcpt.IS_TOPIC", 1, length),
        new ColumnHeader("rlptxrcpt.LC_CORRECTION", 1, length),
        new ColumnHeader("rlptxrcpt.LIMB", 32, length),
        new ColumnHeader("rlptxrcpt.LIMB_CONSTRUCTED", 1, length),
        new ColumnHeader("rlptxrcpt.LOCAL_SIZE", 8, length),
        new ColumnHeader("rlptxrcpt.LOG_ENTRY_SIZE", 8, length),
        new ColumnHeader("rlptxrcpt.nBYTES", 2, length),
        new ColumnHeader("rlptxrcpt.nSTEP", 8, length),
        new ColumnHeader("rlptxrcpt.PHASE_1", 1, length),
        new ColumnHeader("rlptxrcpt.PHASE_2", 1, length),
        new ColumnHeader("rlptxrcpt.PHASE_3", 1, length),
        new ColumnHeader("rlptxrcpt.PHASE_4", 1, length),
        new ColumnHeader("rlptxrcpt.PHASE_5", 1, length),
        new ColumnHeader("rlptxrcpt.PHASE_END", 1, length),
        new ColumnHeader("rlptxrcpt.PHASE_ID", 4, length),
        new ColumnHeader("rlptxrcpt.PHASE_SIZE", 8, length),
        new ColumnHeader("rlptxrcpt.POWER", 32, length),
        new ColumnHeader("rlptxrcpt.TXRCPT_SIZE", 8, length));
  }

  public Trace(List<MappedByteBuffer> buffers) {
    this.absLogNum = buffers.get(0);
    this.absLogNumMax = buffers.get(1);
    this.absTxNum = buffers.get(2);
    this.absTxNumMax = buffers.get(3);
    this.acc1 = buffers.get(4);
    this.acc2 = buffers.get(5);
    this.acc3 = buffers.get(6);
    this.acc4 = buffers.get(7);
    this.accSize = buffers.get(8);
    this.bit = buffers.get(9);
    this.bitAcc = buffers.get(10);
    this.byte1 = buffers.get(11);
    this.byte2 = buffers.get(12);
    this.byte3 = buffers.get(13);
    this.byte4 = buffers.get(14);
    this.counter = buffers.get(15);
    this.depth1 = buffers.get(16);
    this.done = buffers.get(17);
    this.index = buffers.get(18);
    this.indexLocal = buffers.get(19);
    this.input1 = buffers.get(20);
    this.input2 = buffers.get(21);
    this.input3 = buffers.get(22);
    this.input4 = buffers.get(23);
    this.isData = buffers.get(24);
    this.isPrefix = buffers.get(25);
    this.isTopic = buffers.get(26);
    this.lcCorrection = buffers.get(27);
    this.limb = buffers.get(28);
    this.limbConstructed = buffers.get(29);
    this.localSize = buffers.get(30);
    this.logEntrySize = buffers.get(31);
    this.nBytes = buffers.get(32);
    this.nStep = buffers.get(33);
    this.phase1 = buffers.get(34);
    this.phase2 = buffers.get(35);
    this.phase3 = buffers.get(36);
    this.phase4 = buffers.get(37);
    this.phase5 = buffers.get(38);
    this.phaseEnd = buffers.get(39);
    this.phaseId = buffers.get(40);
    this.phaseSize = buffers.get(41);
    this.power = buffers.get(42);
    this.txrcptSize = buffers.get(43);
  }

  public int size() {
    if (!filled.isEmpty()) {
      throw new RuntimeException("Cannot measure a trace with a non-validated row.");
    }

    return this.currentLine;
  }

  public Trace absLogNum(final long b) {
    if (filled.get(0)) {
      throw new IllegalStateException("rlptxrcpt.ABS_LOG_NUM already set");
    } else {
      filled.set(0);
    }

    absLogNum.putLong(b);

    return this;
  }

  public Trace absLogNumMax(final long b) {
    if (filled.get(1)) {
      throw new IllegalStateException("rlptxrcpt.ABS_LOG_NUM_MAX already set");
    } else {
      filled.set(1);
    }

    absLogNumMax.putLong(b);

    return this;
  }

  public Trace absTxNum(final long b) {
    if (filled.get(2)) {
      throw new IllegalStateException("rlptxrcpt.ABS_TX_NUM already set");
    } else {
      filled.set(2);
    }

    absTxNum.putLong(b);

    return this;
  }

  public Trace absTxNumMax(final long b) {
    if (filled.get(3)) {
      throw new IllegalStateException("rlptxrcpt.ABS_TX_NUM_MAX already set");
    } else {
      filled.set(3);
    }

    absTxNumMax.putLong(b);

    return this;
  }

  public Trace acc1(final Bytes b) {
    if (filled.get(4)) {
      throw new IllegalStateException("rlptxrcpt.ACC_1 already set");
    } else {
      filled.set(4);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      acc1.put((byte) 0);
    }
    acc1.put(b.toArrayUnsafe());

    return this;
  }

  public Trace acc2(final Bytes b) {
    if (filled.get(5)) {
      throw new IllegalStateException("rlptxrcpt.ACC_2 already set");
    } else {
      filled.set(5);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      acc2.put((byte) 0);
    }
    acc2.put(b.toArrayUnsafe());

    return this;
  }

  public Trace acc3(final Bytes b) {
    if (filled.get(6)) {
      throw new IllegalStateException("rlptxrcpt.ACC_3 already set");
    } else {
      filled.set(6);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      acc3.put((byte) 0);
    }
    acc3.put(b.toArrayUnsafe());

    return this;
  }

  public Trace acc4(final Bytes b) {
    if (filled.get(7)) {
      throw new IllegalStateException("rlptxrcpt.ACC_4 already set");
    } else {
      filled.set(7);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      acc4.put((byte) 0);
    }
    acc4.put(b.toArrayUnsafe());

    return this;
  }

  public Trace accSize(final short b) {
    if (filled.get(8)) {
      throw new IllegalStateException("rlptxrcpt.ACC_SIZE already set");
    } else {
      filled.set(8);
    }

    accSize.putShort(b);

    return this;
  }

  public Trace bit(final Boolean b) {
    if (filled.get(9)) {
      throw new IllegalStateException("rlptxrcpt.BIT already set");
    } else {
      filled.set(9);
    }

    bit.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace bitAcc(final UnsignedByte b) {
    if (filled.get(10)) {
      throw new IllegalStateException("rlptxrcpt.BIT_ACC already set");
    } else {
      filled.set(10);
    }

    bitAcc.put(b.toByte());

    return this;
  }

  public Trace byte1(final UnsignedByte b) {
    if (filled.get(11)) {
      throw new IllegalStateException("rlptxrcpt.BYTE_1 already set");
    } else {
      filled.set(11);
    }

    byte1.put(b.toByte());

    return this;
  }

  public Trace byte2(final UnsignedByte b) {
    if (filled.get(12)) {
      throw new IllegalStateException("rlptxrcpt.BYTE_2 already set");
    } else {
      filled.set(12);
    }

    byte2.put(b.toByte());

    return this;
  }

  public Trace byte3(final UnsignedByte b) {
    if (filled.get(13)) {
      throw new IllegalStateException("rlptxrcpt.BYTE_3 already set");
    } else {
      filled.set(13);
    }

    byte3.put(b.toByte());

    return this;
  }

  public Trace byte4(final UnsignedByte b) {
    if (filled.get(14)) {
      throw new IllegalStateException("rlptxrcpt.BYTE_4 already set");
    } else {
      filled.set(14);
    }

    byte4.put(b.toByte());

    return this;
  }

  public Trace counter(final long b) {
    if (filled.get(15)) {
      throw new IllegalStateException("rlptxrcpt.COUNTER already set");
    } else {
      filled.set(15);
    }

    counter.putLong(b);

    return this;
  }

  public Trace depth1(final Boolean b) {
    if (filled.get(16)) {
      throw new IllegalStateException("rlptxrcpt.DEPTH_1 already set");
    } else {
      filled.set(16);
    }

    depth1.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace done(final Boolean b) {
    if (filled.get(17)) {
      throw new IllegalStateException("rlptxrcpt.DONE already set");
    } else {
      filled.set(17);
    }

    done.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace index(final int b) {
    if (filled.get(18)) {
      throw new IllegalStateException("rlptxrcpt.INDEX already set");
    } else {
      filled.set(18);
    }

    index.putInt(b);

    return this;
  }

  public Trace indexLocal(final int b) {
    if (filled.get(19)) {
      throw new IllegalStateException("rlptxrcpt.INDEX_LOCAL already set");
    } else {
      filled.set(19);
    }

    indexLocal.putInt(b);

    return this;
  }

  public Trace input1(final Bytes b) {
    if (filled.get(20)) {
      throw new IllegalStateException("rlptxrcpt.INPUT_1 already set");
    } else {
      filled.set(20);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      input1.put((byte) 0);
    }
    input1.put(b.toArrayUnsafe());

    return this;
  }

  public Trace input2(final Bytes b) {
    if (filled.get(21)) {
      throw new IllegalStateException("rlptxrcpt.INPUT_2 already set");
    } else {
      filled.set(21);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      input2.put((byte) 0);
    }
    input2.put(b.toArrayUnsafe());

    return this;
  }

  public Trace input3(final Bytes b) {
    if (filled.get(22)) {
      throw new IllegalStateException("rlptxrcpt.INPUT_3 already set");
    } else {
      filled.set(22);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      input3.put((byte) 0);
    }
    input3.put(b.toArrayUnsafe());

    return this;
  }

  public Trace input4(final Bytes b) {
    if (filled.get(23)) {
      throw new IllegalStateException("rlptxrcpt.INPUT_4 already set");
    } else {
      filled.set(23);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      input4.put((byte) 0);
    }
    input4.put(b.toArrayUnsafe());

    return this;
  }

  public Trace isData(final Boolean b) {
    if (filled.get(24)) {
      throw new IllegalStateException("rlptxrcpt.IS_DATA already set");
    } else {
      filled.set(24);
    }

    isData.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace isPrefix(final Boolean b) {
    if (filled.get(25)) {
      throw new IllegalStateException("rlptxrcpt.IS_PREFIX already set");
    } else {
      filled.set(25);
    }

    isPrefix.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace isTopic(final Boolean b) {
    if (filled.get(26)) {
      throw new IllegalStateException("rlptxrcpt.IS_TOPIC already set");
    } else {
      filled.set(26);
    }

    isTopic.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace lcCorrection(final Boolean b) {
    if (filled.get(27)) {
      throw new IllegalStateException("rlptxrcpt.LC_CORRECTION already set");
    } else {
      filled.set(27);
    }

    lcCorrection.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace limb(final Bytes b) {
    if (filled.get(28)) {
      throw new IllegalStateException("rlptxrcpt.LIMB already set");
    } else {
      filled.set(28);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      limb.put((byte) 0);
    }
    limb.put(b.toArrayUnsafe());

    return this;
  }

  public Trace limbConstructed(final Boolean b) {
    if (filled.get(29)) {
      throw new IllegalStateException("rlptxrcpt.LIMB_CONSTRUCTED already set");
    } else {
      filled.set(29);
    }

    limbConstructed.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace localSize(final long b) {
    if (filled.get(30)) {
      throw new IllegalStateException("rlptxrcpt.LOCAL_SIZE already set");
    } else {
      filled.set(30);
    }

    localSize.putLong(b);

    return this;
  }

  public Trace logEntrySize(final long b) {
    if (filled.get(31)) {
      throw new IllegalStateException("rlptxrcpt.LOG_ENTRY_SIZE already set");
    } else {
      filled.set(31);
    }

    logEntrySize.putLong(b);

    return this;
  }

  public Trace nBytes(final short b) {
    if (filled.get(42)) {
      throw new IllegalStateException("rlptxrcpt.nBYTES already set");
    } else {
      filled.set(42);
    }

    nBytes.putShort(b);

    return this;
  }

  public Trace nStep(final long b) {
    if (filled.get(43)) {
      throw new IllegalStateException("rlptxrcpt.nSTEP already set");
    } else {
      filled.set(43);
    }

    nStep.putLong(b);

    return this;
  }

  public Trace phase1(final Boolean b) {
    if (filled.get(32)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_1 already set");
    } else {
      filled.set(32);
    }

    phase1.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace phase2(final Boolean b) {
    if (filled.get(33)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_2 already set");
    } else {
      filled.set(33);
    }

    phase2.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace phase3(final Boolean b) {
    if (filled.get(34)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_3 already set");
    } else {
      filled.set(34);
    }

    phase3.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace phase4(final Boolean b) {
    if (filled.get(35)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_4 already set");
    } else {
      filled.set(35);
    }

    phase4.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace phase5(final Boolean b) {
    if (filled.get(36)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_5 already set");
    } else {
      filled.set(36);
    }

    phase5.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace phaseEnd(final Boolean b) {
    if (filled.get(37)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_END already set");
    } else {
      filled.set(37);
    }

    phaseEnd.put((byte) (b ? 1 : 0));

    return this;
  }

  public Trace phaseId(final int b) {
    if (filled.get(38)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_ID already set");
    } else {
      filled.set(38);
    }

    phaseId.putInt(b);

    return this;
  }

  public Trace phaseSize(final long b) {
    if (filled.get(39)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_SIZE already set");
    } else {
      filled.set(39);
    }

    phaseSize.putLong(b);

    return this;
  }

  public Trace power(final Bytes b) {
    if (filled.get(40)) {
      throw new IllegalStateException("rlptxrcpt.POWER already set");
    } else {
      filled.set(40);
    }

    final byte[] bs = b.toArrayUnsafe();
    for (int i = bs.length; i < 32; i++) {
      power.put((byte) 0);
    }
    power.put(b.toArrayUnsafe());

    return this;
  }

  public Trace txrcptSize(final long b) {
    if (filled.get(41)) {
      throw new IllegalStateException("rlptxrcpt.TXRCPT_SIZE already set");
    } else {
      filled.set(41);
    }

    txrcptSize.putLong(b);

    return this;
  }

  public Trace validateRow() {
    if (!filled.get(0)) {
      throw new IllegalStateException("rlptxrcpt.ABS_LOG_NUM has not been filled");
    }

    if (!filled.get(1)) {
      throw new IllegalStateException("rlptxrcpt.ABS_LOG_NUM_MAX has not been filled");
    }

    if (!filled.get(2)) {
      throw new IllegalStateException("rlptxrcpt.ABS_TX_NUM has not been filled");
    }

    if (!filled.get(3)) {
      throw new IllegalStateException("rlptxrcpt.ABS_TX_NUM_MAX has not been filled");
    }

    if (!filled.get(4)) {
      throw new IllegalStateException("rlptxrcpt.ACC_1 has not been filled");
    }

    if (!filled.get(5)) {
      throw new IllegalStateException("rlptxrcpt.ACC_2 has not been filled");
    }

    if (!filled.get(6)) {
      throw new IllegalStateException("rlptxrcpt.ACC_3 has not been filled");
    }

    if (!filled.get(7)) {
      throw new IllegalStateException("rlptxrcpt.ACC_4 has not been filled");
    }

    if (!filled.get(8)) {
      throw new IllegalStateException("rlptxrcpt.ACC_SIZE has not been filled");
    }

    if (!filled.get(9)) {
      throw new IllegalStateException("rlptxrcpt.BIT has not been filled");
    }

    if (!filled.get(10)) {
      throw new IllegalStateException("rlptxrcpt.BIT_ACC has not been filled");
    }

    if (!filled.get(11)) {
      throw new IllegalStateException("rlptxrcpt.BYTE_1 has not been filled");
    }

    if (!filled.get(12)) {
      throw new IllegalStateException("rlptxrcpt.BYTE_2 has not been filled");
    }

    if (!filled.get(13)) {
      throw new IllegalStateException("rlptxrcpt.BYTE_3 has not been filled");
    }

    if (!filled.get(14)) {
      throw new IllegalStateException("rlptxrcpt.BYTE_4 has not been filled");
    }

    if (!filled.get(15)) {
      throw new IllegalStateException("rlptxrcpt.COUNTER has not been filled");
    }

    if (!filled.get(16)) {
      throw new IllegalStateException("rlptxrcpt.DEPTH_1 has not been filled");
    }

    if (!filled.get(17)) {
      throw new IllegalStateException("rlptxrcpt.DONE has not been filled");
    }

    if (!filled.get(18)) {
      throw new IllegalStateException("rlptxrcpt.INDEX has not been filled");
    }

    if (!filled.get(19)) {
      throw new IllegalStateException("rlptxrcpt.INDEX_LOCAL has not been filled");
    }

    if (!filled.get(20)) {
      throw new IllegalStateException("rlptxrcpt.INPUT_1 has not been filled");
    }

    if (!filled.get(21)) {
      throw new IllegalStateException("rlptxrcpt.INPUT_2 has not been filled");
    }

    if (!filled.get(22)) {
      throw new IllegalStateException("rlptxrcpt.INPUT_3 has not been filled");
    }

    if (!filled.get(23)) {
      throw new IllegalStateException("rlptxrcpt.INPUT_4 has not been filled");
    }

    if (!filled.get(24)) {
      throw new IllegalStateException("rlptxrcpt.IS_DATA has not been filled");
    }

    if (!filled.get(25)) {
      throw new IllegalStateException("rlptxrcpt.IS_PREFIX has not been filled");
    }

    if (!filled.get(26)) {
      throw new IllegalStateException("rlptxrcpt.IS_TOPIC has not been filled");
    }

    if (!filled.get(27)) {
      throw new IllegalStateException("rlptxrcpt.LC_CORRECTION has not been filled");
    }

    if (!filled.get(28)) {
      throw new IllegalStateException("rlptxrcpt.LIMB has not been filled");
    }

    if (!filled.get(29)) {
      throw new IllegalStateException("rlptxrcpt.LIMB_CONSTRUCTED has not been filled");
    }

    if (!filled.get(30)) {
      throw new IllegalStateException("rlptxrcpt.LOCAL_SIZE has not been filled");
    }

    if (!filled.get(31)) {
      throw new IllegalStateException("rlptxrcpt.LOG_ENTRY_SIZE has not been filled");
    }

    if (!filled.get(42)) {
      throw new IllegalStateException("rlptxrcpt.nBYTES has not been filled");
    }

    if (!filled.get(43)) {
      throw new IllegalStateException("rlptxrcpt.nSTEP has not been filled");
    }

    if (!filled.get(32)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_1 has not been filled");
    }

    if (!filled.get(33)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_2 has not been filled");
    }

    if (!filled.get(34)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_3 has not been filled");
    }

    if (!filled.get(35)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_4 has not been filled");
    }

    if (!filled.get(36)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_5 has not been filled");
    }

    if (!filled.get(37)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_END has not been filled");
    }

    if (!filled.get(38)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_ID has not been filled");
    }

    if (!filled.get(39)) {
      throw new IllegalStateException("rlptxrcpt.PHASE_SIZE has not been filled");
    }

    if (!filled.get(40)) {
      throw new IllegalStateException("rlptxrcpt.POWER has not been filled");
    }

    if (!filled.get(41)) {
      throw new IllegalStateException("rlptxrcpt.TXRCPT_SIZE has not been filled");
    }

    filled.clear();
    this.currentLine++;

    return this;
  }

  public Trace fillAndValidateRow() {
    if (!filled.get(0)) {
      absLogNum.position(absLogNum.position() + 8);
    }

    if (!filled.get(1)) {
      absLogNumMax.position(absLogNumMax.position() + 8);
    }

    if (!filled.get(2)) {
      absTxNum.position(absTxNum.position() + 8);
    }

    if (!filled.get(3)) {
      absTxNumMax.position(absTxNumMax.position() + 8);
    }

    if (!filled.get(4)) {
      acc1.position(acc1.position() + 32);
    }

    if (!filled.get(5)) {
      acc2.position(acc2.position() + 32);
    }

    if (!filled.get(6)) {
      acc3.position(acc3.position() + 32);
    }

    if (!filled.get(7)) {
      acc4.position(acc4.position() + 32);
    }

    if (!filled.get(8)) {
      accSize.position(accSize.position() + 2);
    }

    if (!filled.get(9)) {
      bit.position(bit.position() + 1);
    }

    if (!filled.get(10)) {
      bitAcc.position(bitAcc.position() + 1);
    }

    if (!filled.get(11)) {
      byte1.position(byte1.position() + 1);
    }

    if (!filled.get(12)) {
      byte2.position(byte2.position() + 1);
    }

    if (!filled.get(13)) {
      byte3.position(byte3.position() + 1);
    }

    if (!filled.get(14)) {
      byte4.position(byte4.position() + 1);
    }

    if (!filled.get(15)) {
      counter.position(counter.position() + 8);
    }

    if (!filled.get(16)) {
      depth1.position(depth1.position() + 1);
    }

    if (!filled.get(17)) {
      done.position(done.position() + 1);
    }

    if (!filled.get(18)) {
      index.position(index.position() + 4);
    }

    if (!filled.get(19)) {
      indexLocal.position(indexLocal.position() + 4);
    }

    if (!filled.get(20)) {
      input1.position(input1.position() + 32);
    }

    if (!filled.get(21)) {
      input2.position(input2.position() + 32);
    }

    if (!filled.get(22)) {
      input3.position(input3.position() + 32);
    }

    if (!filled.get(23)) {
      input4.position(input4.position() + 32);
    }

    if (!filled.get(24)) {
      isData.position(isData.position() + 1);
    }

    if (!filled.get(25)) {
      isPrefix.position(isPrefix.position() + 1);
    }

    if (!filled.get(26)) {
      isTopic.position(isTopic.position() + 1);
    }

    if (!filled.get(27)) {
      lcCorrection.position(lcCorrection.position() + 1);
    }

    if (!filled.get(28)) {
      limb.position(limb.position() + 32);
    }

    if (!filled.get(29)) {
      limbConstructed.position(limbConstructed.position() + 1);
    }

    if (!filled.get(30)) {
      localSize.position(localSize.position() + 8);
    }

    if (!filled.get(31)) {
      logEntrySize.position(logEntrySize.position() + 8);
    }

    if (!filled.get(42)) {
      nBytes.position(nBytes.position() + 2);
    }

    if (!filled.get(43)) {
      nStep.position(nStep.position() + 8);
    }

    if (!filled.get(32)) {
      phase1.position(phase1.position() + 1);
    }

    if (!filled.get(33)) {
      phase2.position(phase2.position() + 1);
    }

    if (!filled.get(34)) {
      phase3.position(phase3.position() + 1);
    }

    if (!filled.get(35)) {
      phase4.position(phase4.position() + 1);
    }

    if (!filled.get(36)) {
      phase5.position(phase5.position() + 1);
    }

    if (!filled.get(37)) {
      phaseEnd.position(phaseEnd.position() + 1);
    }

    if (!filled.get(38)) {
      phaseId.position(phaseId.position() + 4);
    }

    if (!filled.get(39)) {
      phaseSize.position(phaseSize.position() + 8);
    }

    if (!filled.get(40)) {
      power.position(power.position() + 32);
    }

    if (!filled.get(41)) {
      txrcptSize.position(txrcptSize.position() + 8);
    }

    filled.clear();
    this.currentLine++;

    return this;
  }

  public void build() {
    if (!filled.isEmpty()) {
      throw new IllegalStateException("Cannot build trace with a non-validated row.");
    }
  }
}
