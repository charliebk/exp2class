public class IfcMaterialRelationship : IfcResourceLevelRelationship
{
    public IfcMaterial RelatingMaterial { get; set; }
    public SET [1:?] OF IfcMaterial RelatedMaterials { get; set; }
    public IfcLabel MaterialExpression { get; set; }
}
