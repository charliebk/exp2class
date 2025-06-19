public class IfcRelAssigns extends IfcRelationship {
    public SET [1:?] OF IfcObjectDefinition RelatedObjects;
    public IfcStrippedOptional RelatedObjectsType;

    // === EXTENDED BY ===
    // IfcRelAssignsToActor
    // IfcRelAssignsToControl
    // IfcRelAssignsToGroup
    // IfcRelAssignsToProcess
    // IfcRelAssignsToProduct
    // IfcRelAssignsToResource
}
