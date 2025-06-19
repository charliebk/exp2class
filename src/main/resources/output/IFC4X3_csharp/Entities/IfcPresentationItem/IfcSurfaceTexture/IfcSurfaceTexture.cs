public class IfcSurfaceTexture : IfcPresentationItem
{
    public IfcBoolean RepeatS { get; set; }
    public IfcBoolean RepeatT { get; set; }
    public IfcIdentifier Mode { get; set; }
    public IfcCartesianTransformationOperator2D TextureTransform { get; set; }
    public List<IfcIdentifier> Parameter { get; set; }

    // === EXTENDED BY ===
    // IfcBlobTexture
    // IfcImageTexture
    // IfcPixelTexture

    // === INVERSE CLAUSES ===
    // IsMappedBy : SET [0:?] OF IfcTextureCoordinate FOR Maps
    // UsedInStyles : SET [0:?] OF IfcSurfaceStyleWithTextures FOR Textures
}
