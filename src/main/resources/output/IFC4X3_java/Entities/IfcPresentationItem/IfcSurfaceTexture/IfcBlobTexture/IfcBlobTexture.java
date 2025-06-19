public class IfcBlobTexture extends IfcSurfaceTexture {
    public IfcIdentifier RasterFormat;
    public IfcBinary RasterCode;

    // === WHERE CLAUSES ===
    // RasterCodeByteStream : BLENGTH(RasterCode) MOD 8 = 0
    // SupportedRasterFormat : SELF.RasterFormat IN ['BMP', 'JPG', 'GIF', 'PNG']
}
