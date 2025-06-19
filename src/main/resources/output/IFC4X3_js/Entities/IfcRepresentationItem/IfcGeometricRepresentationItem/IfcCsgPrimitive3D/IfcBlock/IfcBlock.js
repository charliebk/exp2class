class IfcBlock extends IfcCsgPrimitive3D {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.XLength = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.YLength = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.ZLength = null;
    }
}
