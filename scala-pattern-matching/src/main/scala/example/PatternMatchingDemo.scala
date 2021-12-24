package example

sealed trait Account
case class Paypal(email: String) extends Account
case class Bitcoin(key: String) extends Account
case class User(name: String,account: Account)

def whatis(obj: Any) {
	obj match {
		case User(name,Paypal(email)) => s"Paypal with email : ${email}"
		case User(name,Bitcoin(key))  => s"Bitcoin with key : ${Key}"
		case _                        => "Unknown type"
	}
}
