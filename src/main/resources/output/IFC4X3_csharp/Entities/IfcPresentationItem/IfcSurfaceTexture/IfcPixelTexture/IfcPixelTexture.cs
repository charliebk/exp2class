public class IfcPixelTexture : IfcSurfaceTexture
{
    public IfcInteger Width { get; set; }
    public IfcInteger Height { get; set; }
    public IfcInteger ColourComponents { get; set; }
    public List<IfcBinary> Pixel { get; set; }

    // === WHERE CLAUSES ===
    // MinPixelInS : Width >= 1
    // MinPixelInT : Height >= 1
    // NumberOfColours : {1 <= ColourComponents <= 4}
    // PixelAsByteAndSameLength : SIZEOF(QUERY(temp<* Pixel | (BLENGTH(temp) MOD 8 = 0) AND (BLENGTH(temp) = BLENGTH(Pixel[1])) )) = SIZEOF(Pixel)
    // SizeOfPixelList : SIZEOF(Pixel) = (Width * Height)
}
