package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcPixelTexture extends IfcSurfaceTexture {

    public IfcInteger Width;
    public IfcInteger Height;
    public IfcInteger ColourComponents;
    // INVERSE attributes:
    // MinPixelInS : Width >= 1;
    // MinPixelInT : Height >= 1;
    // NumberOfColours : {1 <= ColourComponents <= 4};
    // PixelAsByteAndSameLength : SIZEOF(QUERY(temp<* Pixel |
    // (BLENGTH(temp) MOD 8 = 0) AND
    // (BLENGTH(temp) = BLENGTH(Pixel[1]))
    // )) = SIZEOF(Pixel);
    // SizeOfPixelList : SIZEOF(Pixel) = (Width * Height);

    // WHERE constraints:
    // MinPixelInS : Width >= 1;
    // MinPixelInT : Height >= 1;
    // NumberOfColours : {1 <= ColourComponents <= 4};
    // PixelAsByteAndSameLength : SIZEOF(QUERY(temp<* Pixel |
    // (BLENGTH(temp) MOD 8 = 0) AND
    // (BLENGTH(temp) = BLENGTH(Pixel[1]))
    // )) = SIZEOF(Pixel);
    // SizeOfPixelList : SIZEOF(Pixel) = (Width * Height);
}
