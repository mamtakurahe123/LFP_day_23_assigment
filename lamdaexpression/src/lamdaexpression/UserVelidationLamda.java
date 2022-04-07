package lamdaexpression;

@FunctionalInterface
public
interface UserVelidationLamda {
	boolean validate(String regex);
}