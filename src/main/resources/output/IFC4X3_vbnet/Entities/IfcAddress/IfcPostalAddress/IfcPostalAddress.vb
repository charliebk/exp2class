Public Class IfcPostalAddress Inherits IfcAddress
    Public InternalLocation As IfcLabel
    Public AddressLines As List(Of IfcLabel)
    Public PostalBox As IfcLabel
    Public Town As IfcLabel
    Public Region As IfcLabel
    Public PostalCode As IfcLabel
    Public Country As IfcLabel

    ' === WHERE CLAUSES ===
    ' WR1 : EXISTS (InternalLocation) OR EXISTS (AddressLines) OR EXISTS (PostalBox) OR EXISTS (PostalCode) OR EXISTS (Town) OR EXISTS (Region) OR EXISTS (Country)
End Class
