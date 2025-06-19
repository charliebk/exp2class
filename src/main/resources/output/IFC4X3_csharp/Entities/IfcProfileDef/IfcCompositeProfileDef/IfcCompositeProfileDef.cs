public class IfcCompositeProfileDef : IfcProfileDef
{
    public SET [2:?] OF IfcProfileDef Profiles { get; set; }
    public IfcLabel Label { get; set; }

    // === WHERE CLAUSES ===
    // InvariantProfileType : SIZEOF(QUERY(temp <* Profiles | temp.ProfileType <> Profiles[1].ProfileType)) = 0
    // NoRecursion : SIZEOF(QUERY(temp <* Profiles | 'IFC4X3_DEV_73740fe4.IFCCOMPOSITEPROFILEDEF' IN TYPEOF(temp))) = 0
}
