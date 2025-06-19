public class IfcRelAssociates : IfcRelationship
{
    public SET [1:?] OF IfcDefinitionSelect RelatedObjects { get; set; }

    // === EXTENDED BY ===
    // IfcRelAssociatesApproval
    // IfcRelAssociatesClassification
    // IfcRelAssociatesConstraint
    // IfcRelAssociatesDocument
    // IfcRelAssociatesLibrary
    // IfcRelAssociatesMaterial
    // IfcRelAssociatesProfileDef
}
