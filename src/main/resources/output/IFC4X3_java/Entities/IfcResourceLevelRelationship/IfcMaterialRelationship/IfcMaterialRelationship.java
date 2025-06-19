public class IfcMaterialRelationship extends IfcResourceLevelRelationship {
    public IfcMaterial RelatingMaterial;
    public SET [1:?] OF IfcMaterial RelatedMaterials;
    public IfcLabel MaterialExpression;
}
