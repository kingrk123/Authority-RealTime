package in.nit.JwtWithAuthority.service;

import in.nit.JwtWithAuthority.entity.User;
import in.nit.JwtWithAuthority.exception.domain.EmailExistException;
import in.nit.JwtWithAuthority.exception.domain.UserNotFoundException;
import in.nit.JwtWithAuthority.exception.domain.UsernameExistException;

import javax.mail.MessagingException;
import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email)
            throws UserNotFoundException, UsernameExistException, EmailExistException,
            UserNotFoundException, UsernameExistException, EmailExistException, MessagingException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
