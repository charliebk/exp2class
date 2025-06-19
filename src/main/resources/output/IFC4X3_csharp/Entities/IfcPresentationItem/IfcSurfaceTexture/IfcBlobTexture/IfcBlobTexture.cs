public class IfcBlobTexture : IfcSurfaceTexture
{
    public IfcIdentifier RasterFormat { get; set; }
    public IfcBinary RasterCode { get; set; }

    // === WHERE CLAUSES ===
    // RasterCodeByteStream : BLENGTH(RasterCode) MOD 8 = 0
    // SupportedRasterFormat : SELF.RasterFormat IN ['BMP', 'JPG', 'GIF', 'PNG']
}
