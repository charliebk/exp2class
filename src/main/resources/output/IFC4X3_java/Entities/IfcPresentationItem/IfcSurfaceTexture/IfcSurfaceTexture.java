public class IfcSurfaceTexture extends IfcPresentationItem {
    public IfcBoolean RepeatS;
    public IfcBoolean RepeatT;
    public IfcIdentifier Mode;
    public IfcCartesianTransformationOperator2D TextureTransform;
    public List<IfcIdentifier> Parameter;

    // === EXTENDED BY ===
    // IfcBlobTexture
    // IfcImageTexture
    // IfcPixelTexture

    // === INVERSE CLAUSES ===
    // IsMappedBy : SET [0:?] OF IfcTextureCoordinate FOR Maps
    // UsedInStyles : SET [0:?] OF IfcSurfaceStyleWithTextures FOR Textures
}
