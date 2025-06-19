class IfcTextureMap extends IfcTextureCoordinate {
    constructor() {
        /** @type {IFCTEXTUREVERTEX[]} */
        this.Vertices = null;
        /** @type {IFCFACE} */
        this.MappedTo = null;
    }
}
