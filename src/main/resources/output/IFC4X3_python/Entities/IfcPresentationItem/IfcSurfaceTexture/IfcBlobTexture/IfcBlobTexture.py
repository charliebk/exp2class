class IfcBlobTexture(IfcSurfaceTexture):
    def __init__(self):
        self.RasterFormat: IfcIdentifier = None
        self.RasterCode: IfcBinary = None

    # === WHERE CLAUSES ===
    # RasterCodeByteStream : BLENGTH(RasterCode) MOD 8 = 0
    # SupportedRasterFormat : SELF.RasterFormat IN ['BMP', 'JPG', 'GIF', 'PNG']
