public class IfcRelAssigns : IfcRelationship
{
    public SET [1:?] OF IfcObjectDefinition RelatedObjects { get; set; }
    public IfcStrippedOptional RelatedObjectsType { get; set; }

    // === EXTENDED BY ===
    // IfcRelAssignsToActor
    // IfcRelAssignsToControl
    // IfcRelAssignsToGroup
    // IfcRelAssignsToProcess
    // IfcRelAssignsToProduct
    // IfcRelAssignsToResource
}
