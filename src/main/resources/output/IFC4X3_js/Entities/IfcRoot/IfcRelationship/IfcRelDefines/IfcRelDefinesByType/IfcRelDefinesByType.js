class IfcRelDefinesByType extends IfcRelDefines {
    constructor() {
        /** @type {SET [1:?] OF IFCOBJECT} */
        this.RelatedObjects = null;
        /** @type {IFCTYPEOBJECT} */
        this.RelatingType = null;
    }
}
