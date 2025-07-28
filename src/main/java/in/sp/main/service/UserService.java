package in.sp.main.service;

import in.sp.main.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService
{
    public User createUser(User user);

    public List<User> getAllUser();
    public Optional<User> getUser(int id);
    public void delete(int id);
}
