class IfcIndexedTextureMap extends IfcTextureCoordinate {
    constructor() {
        /** @type {IFCTESSELLATEDFACESET} */
        this.MappedTo = null;
        /** @type {IFCTEXTUREVERTEXLIST} */
        this.TexCoords = null;
    }

    // === EXTENDED BY ===
    // IfcIndexedPolygonalTextureMap
    // IfcIndexedTriangleTextureMap
}
