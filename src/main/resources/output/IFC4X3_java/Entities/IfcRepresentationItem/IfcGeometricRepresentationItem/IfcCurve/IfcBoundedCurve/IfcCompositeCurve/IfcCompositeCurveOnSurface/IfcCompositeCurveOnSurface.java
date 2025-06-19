public class IfcCompositeCurveOnSurface extends IfcCompositeCurve {

    // === EXTENDED BY ===
    // IfcBoundaryCurve

    // === WHERE CLAUSES ===
    // SameSurface : SIZEOF(BasisSurface) > 0

    // === DERIVE CLAUSES ===
    // BasisSurface : SET [0:1] OF IfcSurface := IfcGetBasisSurface(SELF)
}
