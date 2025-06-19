class IfcCompositeProfileDef(IfcProfileDef):
    def __init__(self):
        self.Profiles: SET [2:?] OF IfcProfileDef = None
        self.Label: IfcLabel = None

    # === WHERE CLAUSES ===
    # InvariantProfileType : SIZEOF(QUERY(temp <* Profiles | temp.ProfileType <> Profiles[1].ProfileType)) = 0
    # NoRecursion : SIZEOF(QUERY(temp <* Profiles | 'IFC4X3_DEV_73740fe4.IFCCOMPOSITEPROFILEDEF' IN TYPEOF(temp))) = 0
