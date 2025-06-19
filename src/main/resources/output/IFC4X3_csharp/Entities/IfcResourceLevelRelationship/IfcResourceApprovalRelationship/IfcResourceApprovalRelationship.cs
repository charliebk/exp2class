public class IfcResourceApprovalRelationship : IfcResourceLevelRelationship
{
    public SET [1:?] OF IfcResourceObjectSelect RelatedResourceObjects { get; set; }
    public IfcApproval RelatingApproval { get; set; }
}
