public class IfcApprovalRelationship : IfcResourceLevelRelationship
{
    public IfcApproval RelatingApproval { get; set; }
    public SET [1:?] OF IfcApproval RelatedApprovals { get; set; }
}
