class IfcSurfaceTexture extends IfcPresentationItem {
    constructor() {
        /** @type {IFCBOOLEAN} */
        this.RepeatS = null;
        /** @type {IFCBOOLEAN} */
        this.RepeatT = null;
        /** @type {IFCIDENTIFIER} */
        this.Mode = null;
        /** @type {IFCCARTESIANTRANSFORMATIONOPERATOR2D} */
        this.TextureTransform = null;
        /** @type {IFCIDENTIFIER[]} */
        this.Parameter = null;
    }

    // === EXTENDED BY ===
    // IfcBlobTexture
    // IfcImageTexture
    // IfcPixelTexture

    // === INVERSE CLAUSES ===
    // IsMappedBy : SET [0:?] OF IfcTextureCoordinate FOR Maps
    // UsedInStyles : SET [0:?] OF IfcSurfaceStyleWithTextures FOR Textures
}
