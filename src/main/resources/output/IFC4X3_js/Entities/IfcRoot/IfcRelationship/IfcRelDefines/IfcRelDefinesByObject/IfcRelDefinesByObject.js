class IfcRelDefinesByObject extends IfcRelDefines {
    constructor() {
        /** @type {SET [1:?] OF IFCOBJECT} */
        this.RelatedObjects = null;
        /** @type {IFCOBJECT} */
        this.RelatingObject = null;
    }
}
