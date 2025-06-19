public class IfcResourceApprovalRelationship extends IfcResourceLevelRelationship {
    public SET [1:?] OF IfcResourceObjectSelect RelatedResourceObjects;
    public IfcApproval RelatingApproval;
}
