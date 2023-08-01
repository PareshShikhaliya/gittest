package module2.class4;

public interface CompressionAlgorithm {
    byte[] compress(byte[] data);

    byte[] decompress(byte[] compressedData);

    String getAlgorithmName();
}
