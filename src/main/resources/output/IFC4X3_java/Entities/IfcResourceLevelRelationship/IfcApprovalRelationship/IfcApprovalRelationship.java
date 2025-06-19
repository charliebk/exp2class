public class IfcApprovalRelationship extends IfcResourceLevelRelationship {
    public IfcApproval RelatingApproval;
    public SET [1:?] OF IfcApproval RelatedApprovals;
}
