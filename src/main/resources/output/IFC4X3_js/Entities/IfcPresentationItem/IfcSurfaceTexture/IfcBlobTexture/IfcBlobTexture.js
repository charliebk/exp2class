class IfcBlobTexture extends IfcSurfaceTexture {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.RasterFormat = null;
        /** @type {IFCBINARY} */
        this.RasterCode = null;
    }

    // === WHERE CLAUSES ===
    // RasterCodeByteStream : BLENGTH(RasterCode) MOD 8 = 0
    // SupportedRasterFormat : SELF.RasterFormat IN ['BMP', 'JPG', 'GIF', 'PNG']
}
