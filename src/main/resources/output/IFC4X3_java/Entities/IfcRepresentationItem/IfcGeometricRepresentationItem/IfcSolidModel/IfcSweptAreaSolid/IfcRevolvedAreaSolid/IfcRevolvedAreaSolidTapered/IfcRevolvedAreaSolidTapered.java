public class IfcRevolvedAreaSolidTapered extends IfcRevolvedAreaSolid {
    public IfcProfileDef EndSweptArea;

    // === WHERE CLAUSES ===
    // CorrectProfileAssignment : IfcTaperedSweptAreaProfiles(SELF\IfcSweptAreaSolid.SweptArea, SELF.EndSweptArea)
}
