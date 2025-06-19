from typing import List

class IfcPixelTexture(IfcSurfaceTexture):
    def __init__(self):
        self.Width: IfcInteger = None
        self.Height: IfcInteger = None
        self.ColourComponents: IfcInteger = None
        self.Pixel: List[IfcBinary] = None

    # === WHERE CLAUSES ===
    # MinPixelInS : Width >= 1
    # MinPixelInT : Height >= 1
    # NumberOfColours : {1 <= ColourComponents <= 4}
    # PixelAsByteAndSameLength : SIZEOF(QUERY(temp<* Pixel | (BLENGTH(temp) MOD 8 = 0) AND (BLENGTH(temp) = BLENGTH(Pixel[1])) )) = SIZEOF(Pixel)
    # SizeOfPixelList : SIZEOF(Pixel) = (Width * Height)
