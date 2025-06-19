class IfcRelDefinesByProperties extends IfcRelDefines {
    constructor() {
        /** @type {SET [1:?] OF IFCOBJECTDEFINITION} */
        this.RelatedObjects = null;
        /** @type {IFCPROPERTYSETDEFINITIONSELECT} */
        this.RelatingPropertyDefinition = null;
    }

    // === WHERE CLAUSES ===
    // NoRelatedTypeObject : SIZEOF(QUERY(Types <* SELF\IfcRelDefinesByProperties.RelatedObjects |  'IFC4X3_DEV_73740fe4.IFCTYPEOBJECT' IN TYPEOF(Types))) = 0
}
