public class IfcBoundaryEdgeCondition : IfcBoundaryCondition
{
    public IfcModulusOfTranslationalSubgradeReactionSelect TranslationalStiffnessByLengthX { get; set; }
    public IfcModulusOfTranslationalSubgradeReactionSelect TranslationalStiffnessByLengthY { get; set; }
    public IfcModulusOfTranslationalSubgradeReactionSelect TranslationalStiffnessByLengthZ { get; set; }
    public IfcModulusOfRotationalSubgradeReactionSelect RotationalStiffnessByLengthX { get; set; }
    public IfcModulusOfRotationalSubgradeReactionSelect RotationalStiffnessByLengthY { get; set; }
    public IfcModulusOfRotationalSubgradeReactionSelect RotationalStiffnessByLengthZ { get; set; }
}
