public class IfcRelConnectsStructuralMember : IfcRelConnects
{
    public IfcStructuralMember RelatingStructuralMember { get; set; }
    public IfcStructuralConnection RelatedStructuralConnection { get; set; }
    public IfcBoundaryCondition AppliedCondition { get; set; }
    public IfcStructuralConnectionCondition AdditionalConditions { get; set; }
    public IfcLengthMeasure SupportedLength { get; set; }
    public IfcAxis2Placement3D ConditionCoordinateSystem { get; set; }

    // === EXTENDED BY ===
    // IfcRelConnectsWithEccentricity
}
