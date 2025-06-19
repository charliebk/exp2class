class IfcTopologyRepresentation extends IfcShapeModel {
    constructor() {
        // no parameters
    }

    // === WHERE CLAUSES ===
    // WR21 : SIZEOF(QUERY(temp <* SELF\IfcRepresentation.Items | NOT('IFC4X3_DEV_73740fe4.IFCTOPOLOGICALREPRESENTATIONITEM' IN TYPEOF(temp)) )) = 0
    // WR22 : EXISTS(SELF\IfcRepresentation.RepresentationType)
    // WR23 : IfcTopologyRepresentationTypes(SELF\IfcRepresentation.RepresentationType, SELF\IfcRepresentation.Items)
}
