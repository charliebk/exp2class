public class IfcSurfaceReinforcementArea extends IfcStructuralLoadOrResult {
    public List<IfcLengthMeasure> SurfaceReinforcement1;
    public List<IfcLengthMeasure> SurfaceReinforcement2;
    public IfcRatioMeasure ShearReinforcement;

    // === WHERE CLAUSES ===
    // NonnegativeArea1 : (NOT EXISTS(SurfaceReinforcement1)) OR ( (SurfaceReinforcement1[1] >= 0.) AND (SurfaceReinforcement1[2] >= 0.) AND ((SIZEOF(SurfaceReinforcement1) = 1) OR (SurfaceReinforcement1[1] >= 0.)) )
    // NonnegativeArea2 : (NOT EXISTS(SurfaceReinforcement2)) OR ( (SurfaceReinforcement2[1] >= 0.) AND (SurfaceReinforcement2[2] >= 0.) AND ((SIZEOF(SurfaceReinforcement2) = 1) OR (SurfaceReinforcement2[1] >= 0.)) )
    // NonnegativeArea3 : (NOT EXISTS(ShearReinforcement)) OR (ShearReinforcement >= 0.)
    // SurfaceAndOrShearAreaSpecified : EXISTS(SurfaceReinforcement1) OR EXISTS(SurfaceReinforcement2) OR EXISTS(ShearReinforcement)
}
