class IfcAddress:
    def __init__(self):
        self.Purpose: IfcAddressTypeEnum = None
        self.Description: IfcText = None
        self.UserDefinedPurpose: IfcLabel = None

    # === EXTENDED BY ===
    # IfcPostalAddress
    # IfcTelecomAddress

    # === INVERSE CLAUSES ===
    # OfPerson : SET [0:?] OF IfcPerson FOR Addresses
    # OfOrganization : SET [0:?] OF IfcOrganization FOR Addresses

    # === WHERE CLAUSES ===
    # WR1 : (NOT(EXISTS(Purpose))) OR ((Purpose <> IfcAddressTypeEnum.USERDEFINED) OR ((Purpose = IfcAddressTypeEnum.USERDEFINED) AND EXISTS(SELF.UserDefinedPurpose)))
