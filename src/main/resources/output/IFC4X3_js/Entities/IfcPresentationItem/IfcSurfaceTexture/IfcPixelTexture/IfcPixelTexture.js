class IfcPixelTexture extends IfcSurfaceTexture {
    constructor() {
        /** @type {IFCINTEGER} */
        this.Width = null;
        /** @type {IFCINTEGER} */
        this.Height = null;
        /** @type {IFCINTEGER} */
        this.ColourComponents = null;
        /** @type {IFCBINARY[]} */
        this.Pixel = null;
    }

    // === WHERE CLAUSES ===
    // MinPixelInS : Width >= 1
    // MinPixelInT : Height >= 1
    // NumberOfColours : {1 <= ColourComponents <= 4}
    // PixelAsByteAndSameLength : SIZEOF(QUERY(temp<* Pixel | (BLENGTH(temp) MOD 8 = 0) AND (BLENGTH(temp) = BLENGTH(Pixel[1])) )) = SIZEOF(Pixel)
    // SizeOfPixelList : SIZEOF(Pixel) = (Width * Height)
}
