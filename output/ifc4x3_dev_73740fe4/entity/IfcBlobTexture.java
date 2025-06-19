package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBlobTexture extends IfcSurfaceTexture {

    public IfcIdentifier RasterFormat;
    public IfcBinary RasterCode;
    // INVERSE attributes:
    // RasterCodeByteStream : BLENGTH(RasterCode) MOD 8 = 0;
    // SupportedRasterFormat : SELF.RasterFormat IN ['BMP', 'JPG', 'GIF', 'PNG'];

    // WHERE constraints:
    // RasterCodeByteStream : BLENGTH(RasterCode) MOD 8 = 0;
    // SupportedRasterFormat : SELF.RasterFormat IN ['BMP', 'JPG', 'GIF', 'PNG'];
}
