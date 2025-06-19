class IfcConnectionVolumeGeometry extends IfcConnectionGeometry {
    constructor() {
        /** @type {IFCSOLIDORSHELL} */
        this.VolumeOnRelatingElement = null;
        /** @type {IFCSOLIDORSHELL} */
        this.VolumeOnRelatedElement = null;
    }
}
