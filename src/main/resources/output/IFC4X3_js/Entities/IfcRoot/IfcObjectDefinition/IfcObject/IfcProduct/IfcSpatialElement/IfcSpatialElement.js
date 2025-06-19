class IfcSpatialElement extends IfcProduct {
    constructor() {
        /** @type {IFCLABEL} */
        this.LongName = null;
    }

    // === EXTENDED BY ===
    // IfcExternalSpatialStructureElement
    // IfcSpatialStructureElement
    // IfcSpatialZone

    // === INVERSE CLAUSES ===
    // ContainsElements : SET [0:?] OF IfcRelContainedInSpatialStructure FOR RelatingStructure
    // ServicedBySystems : SET [0:?] OF IfcRelServicesBuildings FOR RelatedBuildings
    // ReferencesElements : SET [0:?] OF IfcRelReferencedInSpatialStructure FOR RelatingStructure
    // IsInterferedByElements : SET [0:?] OF IfcRelInterferesElements FOR RelatedElement
    // InterferesElements : SET [0:?] OF IfcRelInterferesElements FOR RelatingElement
}
