package com.github.idkp.simplenet.example;

import com.github.idkp.simplenet.PacketBufferWriter;
import com.github.idkp.simplenet.PayloadEncoder;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public final class GreetingsPacketPayloadEncoder implements PayloadEncoder<String> {

    @Override
    public void encode(String payload, PacketBufferWriter bufWriter) {
        byte[] payloadBytes = payload.getBytes(StandardCharsets.UTF_8);
        ByteBuffer buf = ByteBuffer.allocate(payloadBytes.length + Integer.BYTES);

        buf.putInt(payloadBytes.length);
        buf.put(payloadBytes);

        bufWriter.write(buf);
    }
}
