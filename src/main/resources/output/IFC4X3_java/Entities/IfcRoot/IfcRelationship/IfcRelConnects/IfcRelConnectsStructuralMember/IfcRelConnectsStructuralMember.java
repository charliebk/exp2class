public class IfcRelConnectsStructuralMember extends IfcRelConnects {
    public IfcStructuralMember RelatingStructuralMember;
    public IfcStructuralConnection RelatedStructuralConnection;
    public IfcBoundaryCondition AppliedCondition;
    public IfcStructuralConnectionCondition AdditionalConditions;
    public IfcLengthMeasure SupportedLength;
    public IfcAxis2Placement3D ConditionCoordinateSystem;

    // === EXTENDED BY ===
    // IfcRelConnectsWithEccentricity
}
