public class IfcPresentationLayerAssignment
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public SET [1:?] OF IfcLayeredItem AssignedItems { get; set; }
    public IfcIdentifier Identifier { get; set; }

    // === EXTENDED BY ===
    // IfcPresentationLayerWithStyle

    // === WHERE CLAUSES ===
    // ApplicableItems : SIZEOF(QUERY(temp <* AssignedItems | ( SIZEOF(TYPEOF(temp) * [ 'IFC4X3_DEV_73740fe4.IFCSHAPEREPRESENTATION', 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONITEM', 'IFC4X3_DEV_73740fe4.IFCMAPPEDITEM']) = 1) )) = SIZEOF(AssignedItems)
}
