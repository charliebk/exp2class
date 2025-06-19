public class IfcShapeRepresentation extends IfcShapeModel {

    // === WHERE CLAUSES ===
    // CorrectContext : 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONCONTEXT' IN TYPEOF(SELF\IfcRepresentation.ContextOfItems)
    // CorrectItemsForType : IfcShapeRepresentationTypes(SELF\IfcRepresentation.RepresentationType, SELF\IfcRepresentation.Items)
    // HasRepresentationIdentifier : EXISTS(SELF\IfcRepresentation.RepresentationIdentifier)
    // HasRepresentationType : EXISTS(SELF\IfcRepresentation.RepresentationType)
    // NoTopologicalItem : SIZEOF(QUERY(temp <* Items | ('IFC4X3_DEV_73740fe4.IFCTOPOLOGICALREPRESENTATIONITEM' IN TYPEOF(temp)) AND (NOT(SIZEOF( ['IFC4X3_DEV_73740fe4.IFCVERTEXPOINT', 'IFC4X3_DEV_73740fe4.IFCEDGECURVE', 'IFC4X3_DEV_73740fe4.IFCFACESURFACE'] * TYPEOF(temp)) = 1)) )) = 0
}
