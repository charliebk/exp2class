package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;
import java.util.Set;

public abstract class IfcSurfaceTexture extends IfcPresentationItem {

    public IfcBoolean RepeatS;
    public IfcBoolean RepeatT;
    public IfcIdentifier Mode; // OPTIONAL
    public IfcCartesianTransformationOperator2D TextureTransform; // OPTIONAL
    // INVERSE attributes:
    // IsMappedBy : SET [0:?] OF IfcTextureCoordinate FOR Maps;
    // UsedInStyles : SET [0:?] OF IfcSurfaceStyleWithTextures FOR Textures;

    // SUPERTYPE OF:
    // - IfcBlobTexture
    // - IfcImageTexture
    // - IfcPixelTexture SUBTYPE OF IfcPresentationItem
}
